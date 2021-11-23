@java.lang.Override
public com.lweynant.yearly.model.BirthdayBuilder set(android.os.Bundle bundle) {
    super.set(bundle);
    if (bundle.containsKey(com.lweynant.yearly.model.BirthdayBuilder.KEY_LAST_NAME)) {
        lastName = bundle.getString(com.lweynant.yearly.model.BirthdayBuilder.KEY_LAST_NAME);
    }
    return this;
}