private void createScript() {
    mRS = android.renderscript.RenderScript.create(this);
    mInAllocation = android.renderscript.Allocation.createFromBitmap(mRS, mBitmapIn, Allocation.MipmapControl.MIPMAP_NONE, Allocation.USAGE_SCRIPT);
    mOutAllocation = android.renderscript.Allocation.createFromBitmap(mRS, mBitmapOut, Allocation.MipmapControl.MIPMAP_NONE, Allocation.USAGE_SCRIPT);
    mScript = new com.example.android.rs.hellocompute.ScriptC_mono(mRS, getResources(), R.raw.mono);
    mScript.forEach_root(mInAllocation, mOutAllocation);
    mOutAllocation.copyTo(mBitmapOut);
}