public void startDataFlow(javax.servlet.http.HttpServletRequest request) {
    java.lang.String path = request.getServletPath();
    switch (path) {
        case ranian.bookkeeping.system.dataflow.DataFlowCarrier.AddOrEditTransRecordData.PATH :
            this.addOrEditTransRecordData = new ranian.bookkeeping.system.dataflow.DataFlowCarrier.AddOrEditTransRecordData(request);
            break;
    }
    this.user = ((ranian.bookkeeping.system.authentication.model.User) (request.getSession().getAttribute(User.SESSION_ATTR_NAME)));
}