@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String message;
    android.content.Intent sendIntent = new android.content.Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    message = ((("Hey! " + (cardEventName.getText())) + " is happening on ") + (cardDate.getText())) + ". Find more info by downloading WhatNow from the Play Store!";
    sendIntent.putExtra(Intent.EXTRA_TEXT, message);
    sendIntent.setType("text/plain");
    v.getContext().startActivity(sendIntent);
}