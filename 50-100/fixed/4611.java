protected void handleSetData(io.oversec.one.crypto.proto.Outer.Msg msg, io.oversec.one.crypto.BaseDecryptResult tdr, io.oversec.one.crypto.images.xcoder.ImageXCoder coder) {
    io.oversec.one.crypto.AbstractCryptoHandler encH = io.oversec.one.crypto.CryptoHandlerFacade.getInstance(getActivity()).getCryptoHandler(tdr);
    if (encH != null) {
        mTvMeth.setText(encH.getDisplayEncryptionMethod());
        mTvMeth.setVisibility(View.VISIBLE);
        mLblMeth.setVisibility(View.VISIBLE);
    }
}