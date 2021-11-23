public void done(boolean result, samurai.geeft.android.geeft.adapters.GeeftItemAdapter.ViewHolder holder, double[] userInformation) {
    if (result) {
        holder.mProfileDialogUserRank.setText(((java.lang.String.valueOf(userInformation[0])) + "/5.0"));
        holder.mProfileDialogUserGiven.setText(java.lang.String.valueOf(((int) (userInformation[1]))));
        holder.mProfileDialogUserReceived.setText(java.lang.String.valueOf(((int) (userInformation[2]))));
    }else {
        android.util.Log.e(samurai.geeft.android.geeft.adapters.GeeftItemAdapter.TAG, "ERROREEEEE!");
    }
}