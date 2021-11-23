@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    android.graphics.drawable.Drawable image = getResources().getDrawable(imageResId[position]);
    image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
    android.text.SpannableString sb = new android.text.SpannableString(" ");
    android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(image, android.text.style.ImageSpan.ALIGN_BOTTOM);
    sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    return sb;
}