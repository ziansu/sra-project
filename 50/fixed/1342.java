@java.lang.Override
public void onDelete(wipraktikum.informationwallandroidapp.BusinessObject.BlackBoard.BlackBoardAttachment blackboardAttachment) {
    attachmentContainer.removeView(attachmentView);
    blackBoardAttachments.remove(blackboardAttachment);
    blackBoardAttachmentViews.remove(attachmentView);
}