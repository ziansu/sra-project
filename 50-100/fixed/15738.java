public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            if (!(dataProvider.checkTask(result6[1], result6[0], result6[2]))) {
                dataProvider.updateTaskDes(result6[0], result6[1], result6[2], result6[3]);
            }else {
                toastMaker.makeToast("This task does not exist.");
            }
            break;
    }
}