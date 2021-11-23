@java.lang.Override
@com.krishagni.catissueplus.core.common.PlusTransactional
public com.krishagni.catissueplus.core.common.events.ResponseEvent<java.util.Map<java.lang.String, java.lang.Object>> authenticateUser(com.krishagni.catissueplus.core.common.events.RequestEvent<com.krishagni.auth.events.LoginDetail> req) {
    return com.krishagni.catissueplus.core.common.util.Utility.invokeFn(super::authenticateUser, req, true);
}