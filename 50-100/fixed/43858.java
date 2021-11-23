public void runNewStickerProcess() {
    new android.support.v7.app.AlertDialog.Builder(this).setIcon(null).setTitle("스티커 추가").setMessage("스트커를 추가하시겠습니까?").setPositiveButton("Yes", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            addNewSticker();
        }
    }).setNegativeButton("No", null).show();
}