@java.lang.Override
protected void onPostExecute(bg.unisofia.fmi.valentinalatinova.core.dto.ResultDto result) {
    if (result.isSuccess()) {
        currentSchedule.setId(result.getId());
        assembleResponseAndFinish();
    }else {
        bg.unisofia.fmi.valentinalatinova.app.MainActivity.createErrorDialog(this, result.getError());
    }
}