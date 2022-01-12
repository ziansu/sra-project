public void onClick(android.view.View v) {
    num = ((num) - 1) % 11;
    java.lang.String mDrawableName = ("l" + (num)) + ".jpg";
    resID = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
    pic.setImageResource(resID);
}