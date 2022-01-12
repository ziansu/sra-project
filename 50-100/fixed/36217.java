@java.lang.Override
public void onClick(android.view.View v) {
    if ((sq.checksaved()) == null) {
        star.setImageResource(R.mipmap.ic_star_unfilled);
        modelsArrayList.get(position).getTag().clear();
        sq.delete();
    }else {
        star.setImageResource(R.mipmap.ic_star_filled);
        sq.save();
    }
}