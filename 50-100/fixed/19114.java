private void registStringBlock(com.umeng.editor.decode.StringBlock sb) {
    namespace = sb.putString(NAME_SPACE);
    meta_data = sb.putString(META_DATA);
    attr_name = sb.putString(NAME);
    attr_value = sb.putString(VALUE);
    channel_name = sb.putString(mChannelName);
}