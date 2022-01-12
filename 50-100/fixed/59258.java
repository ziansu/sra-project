public void onClick(android.content.DialogInterface dialog, int whichButton) {
    if ((input.getText()) != null) {
        com.usoosoft.ache.model.Config config = com.usoosoft.ache.helper.DatabaseHelper.getInstance().getConfigDao().load(((long) (1)));
        com.orhanobut.logger.Logger.d(input.getText().toString());
        config.setHistoryLimit(java.lang.Integer.parseInt(input.getText().toString()));
    }else
        return ;
    
}