@java.lang.Override
public void onActivityResult(android.content.Intent data) {
    wipraktikum.informationwallandroidapp.BusinessObject.BlackBoard.BlackBoardAttachment blackBoardAttachment = wipraktikum.informationwallandroidapp.BusinessObject.BlackBoard.BlackBoardAttachment.createNewAttachmentByFilePath(getFilePathFromResult(data));
    addAttachmentViewToAttachmentContainer(blackBoardAttachment);
    blackBoardAttachments.add(blackBoardAttachment);
    otherFragmentIsVisible = false;
    saveBlackBoardAttachmentsToSharedPrefs();
}