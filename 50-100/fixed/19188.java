@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    if (am.te.myapplication.State.local) {
        return am.te.myapplication.RegistrationModel.getUsers().contains(am.te.myapplication.Service.LoginTask.userToAuthenticate);
    }else {
        java.lang.String loginKey = getLoginKey();
        if (!(((loginKey.equals("*NOSUCHUSER")) || (loginKey.equals(""))) || (loginKey == null))) {
            am.te.myapplication.Model.Agent.setUniqueIDofCurrentlyLoggedIn(loginKey);
            return true;
        }
        return false;
    }
}