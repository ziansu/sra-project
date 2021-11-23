@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(orthodoxHolidayMajor.getDescriptionUrl())));
}