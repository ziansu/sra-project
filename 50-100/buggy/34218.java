public void selectCard(int btnNo, int[] selCard, int[] selCardLv) {
    android.content.Intent intent = new android.content.Intent(this, com.project.tos_project.SelectCardActivity.class);
    android.os.Bundle mBundle = new android.os.Bundle();
    intent.putExtra("cardSelData", selCard);
    intent.putExtra("cardLVData", selCardLv);
    intent.putExtra("disableData", disableCard);
    mBundle.putParcelable(com.project.tos_project.Home.SER_KEY, battle);
    intent.putExtra("btnNo", btnNo);
    intent.putExtras(mBundle);
    startActivityForResult(intent, com.project.tos_project.Home.REQUEST_CODE);
}