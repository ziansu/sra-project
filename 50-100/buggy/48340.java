@java.lang.Override
public android.graphics.drawable.Drawable getBackgroundForRow(int row) {
    android.util.Log.d("BBBBKKKK", "dahkjshdflkadshf");
    int[] bg = new int[]{ R.drawable.stress_bg1 , R.drawable.stress_bg3 , R.drawable.stress_bg5 , R.drawable.stress_bg7 , R.drawable.stress_bg9 , R.drawable.stress_bg11 , R.drawable.stress_bg13 , R.drawable.stress_bg15 };
    int degree = ((dartmouth.edu.wearstress.MainActivity) (mContext)).stressDegree;
    return mContext.getDrawable(bg[(degree / 2)]);
}