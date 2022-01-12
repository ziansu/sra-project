@java.lang.Override
public com.bitdubai.fermat_android_api.layer.definition.wallet.AbstractFermatFragment getFermatFragment(com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.factory.ChatIdentityFragmentsEnumType fragments) throws com.bitdubai.fermat_android_api.layer.definition.wallet.exceptions.FragmentNotFoundException {
    switch (fragments) {
        case CHT_CHAT_CREATE_IDENTITY_FRAGMENT :
            return com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.fragments.CreateChatIdentityFragment.newInstance();
        case CHT_CHAT_EDIT_IDENTITY :
            return com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.fragments.EditChatIdentityFragment.newInstance();
        default :
            throw new com.bitdubai.fermat_android_api.layer.definition.wallet.exceptions.FragmentNotFoundException(java.lang.String.format("Fragment: %s not found", fragments.getKey()), new java.lang.Exception(), "fermat-cht-android-sub-app-identity", "fragment not found");
    }
}