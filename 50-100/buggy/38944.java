@java.lang.Override
public void initTextureBuffer() {
    float[] position = ((mVideoType) == (com.yezi.testmedia.utils.enums.VideoType.VIDEO)) ? com.yezi.testmedia.utils.GL2Utils.FRAGMENT_POSITION_180 : com.yezi.testmedia.utils.GL2Utils.FRAGMENT_POSITION_90;
    mCoord = java.nio.ByteBuffer.allocateDirect(((position.length) * 4)).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(position);
    mCoord.position(0);
}