protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 1) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            if (data.getStringExtra("result").equals("retry")) {
                player.setHp(1);
                this.gameLogic.init();
            }else
                if (data.getStringExtra("result").equals("home")) {
                    finish();
                }else {
                    finish();
                }
            
        }
    }
}