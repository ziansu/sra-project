@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    com.example.uriel.ordertracker.App.Model.Dto.UserDTO userContainer = new com.google.gson.Gson().fromJson(response.toString(), com.example.uriel.ordertracker.App.Model.Dto.UserDTO.class);
    if (Constants.OK_RESPONSE.equals(userContainer.getStatus().getResult()))
        logInActivity.processLoginResponse(userContainer.getData());
    else
        logInActivity.handleUnexpectedError(userContainer.getStatus().getDescription());
    
    this.clearLoginActivityLink();
}