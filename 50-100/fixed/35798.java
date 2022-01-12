private void updateItemRequest(@com.framgia.wsm.utils.RequestType
int requestType, int itemPosition, com.framgia.wsm.data.source.remote.api.response.ActionRequestResponse actionRequestResponse) {
    switch (requestType) {
        case com.framgia.wsm.utils.RequestType.REQUEST_LATE_EARLY :
            mManageListRequestsAdapter.updateItem(requestType, itemPosition, actionRequestResponse);
            break;
        case com.framgia.wsm.utils.RequestType.REQUEST_OFF :
            mManageListRequestsAdapter.updateItem(requestType, itemPosition, actionRequestResponse);
            break;
        case com.framgia.wsm.utils.RequestType.REQUEST_OVERTIME :
            mManageListRequestsAdapter.updateItem(requestType, itemPosition, actionRequestResponse);
            break;
        default :
            break;
    }
}