@java.lang.Override
public void onClick(android.view.View v) {
    if ((orthodoxHolidayMajor.getDescriptionUrl()) != null) {
        startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(orthodoxHolidayMajor.getDescriptionUrl())));
    }
}