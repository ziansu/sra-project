private void handleP2pIntent(android.content.Intent intent) {
    switch (intent.getStringExtra(com.kanedias.vanilla.coverfetch.EXTRA_PARAM_P2P)) {
        case P2P_READ_ART :
            android.content.Intent dialogIntent = new android.content.Intent(this, com.kanedias.vanilla.coverfetch.CoverShowActivity.class);
            dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            dialogIntent.putExtras(mOriginalIntent);
            if (intent.hasExtra(com.kanedias.vanilla.coverfetch.EXTRA_PARAM_P2P_VAL)) {
                dialogIntent.putExtras(intent);
            }
            startActivity(dialogIntent);
            break;
    }
}