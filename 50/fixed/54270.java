public android.graphics.Bitmap peekBitmap() {
    if (stack.empty())
        return null;
    
    return stack.peek();
}