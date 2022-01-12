@java.lang.Override
public void onClick(android.view.View v) {
    final android.os.Bundle btype = new android.os.Bundle();
    btype.putBoolean("type", user);
    btype.putInt("residenceId", residences.get(position).getId());
    util.Utils.goToActivity(context, gr.uoa.di.airbnbproject.ResidenceActivity.class, btype);
}