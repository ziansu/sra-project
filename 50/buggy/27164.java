private void trustKeyChange() {
    org.kontalk.provider.UsersProvider.trustUserKey(getActivity(), mUserJID);
    invalidateContact();
    org.kontalk.service.msgcenter.MessageCenterService.requestPublicKey(getActivity(), mUserJID);
}