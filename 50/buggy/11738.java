@java.lang.Override
@org.xwalk.core.internal.XWalkAPI
public void setLayerType(int layerType, android.graphics.Paint paint) {
    if (layerType != (LAYER_TYPE_SOFTWARE)) {
        super.setLayerType(layerType, paint);
    }else {
        android.util.Log.w(org.xwalk.core.internal.XWalkViewInternal.TAG, "LAYER_TYPE_SOFTWARE is not supported by XwalkView");
    }
}