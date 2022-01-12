@java.lang.Override
public void notify(com.example.mobileservice.worksheet.WorkSheet workSheet) {
    logger.log(this, (((logMessagePrefix) + "Status changed of worksheet: ") + workSheet));
    if ((workSheet.getStatus()) == (com.example.mobileservice.worksheet.WorkSheetInternal.Status.FINISHED)) {
        logger.log(this, ((logMessagePrefix) + "Mobile returned. Unregistering as observer."));
        workSheet.removeObserver(this);
        logger.log(this, ((logMessagePrefix) + "Status is FINISHED. Telling service to return mobile."));
        service.returnMobile(workSheet);
    }
}