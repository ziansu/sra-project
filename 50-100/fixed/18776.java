@java.lang.Override
public void onClick(android.view.View view) {
    com.ourproject.learningapp.globals.GlobalVariables.LETTERTYPE = "NORMAL_MOVEMENT";
    android.content.Intent intent = new android.content.Intent(getActivity(), com.ourproject.learningapp.activities.LettersActivity.class);
    getActivity().startActivity(intent);
    android.content.Intent serviceIntent = new android.content.Intent(getActivity(), com.ourproject.learningapp.services.ServiceClass.class);
    serviceIntent.putExtra("id", R.raw.mini_nasheed);
    getActivity().startService(serviceIntent);
}