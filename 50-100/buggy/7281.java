@java.lang.Override
protected void onPostExecute(java.lang.Object resultObject) {
    if (resultObject == null) {
    }else
        if (resultObject instanceof java.lang.Exception) {
            mImageBytesConsumer.onAssetError(mAsset, ((java.lang.Exception) (resultObject)));
        }else
            if (resultObject instanceof byte[]) {
                mImageBytesConsumer.onAssetBytes(mAsset, ((byte[]) (resultObject)));
            }
        
    
}