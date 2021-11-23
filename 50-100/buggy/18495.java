@java.lang.Override
public void setImageResource(int resId) {
    if (getContext().getResources().getResourceTypeName(resId).equals("raw")) {
        setImageDrawable(new carbon.drawable.VectorDrawable(getResources(), resId));
    }else {
        super.setImageResource(resId);
    }
}