@java.lang.Override
public void validate() {
    if (isHttpPost()) {
        if (getIsRegistered()) {
            iptValidation.validateUpdate(this, getRegisteredIpt());
        }else {
            iptValidation.validate(this, ipt);
            validatedBaseURL = true;
            organisationValidation.validate(this, organisation);
        }
    }
}