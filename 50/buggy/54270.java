public android.graphics.Bitmap peekBitmap() {
    if (stack.empty())
        return null;
    
    android.util.Log.i("test", "#peek");
    return stack.peek();
}