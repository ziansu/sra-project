@java.lang.Override
public void done(java.io.File file, com.parse.ParseException e) {
    com.clothapp.resources.Image toAdd = new com.clothapp.resources.Image(file, object.getObjectId(), object.getString("user"), object.getList("like"), object.getInt("nLike"), object.getList("hashtag"), object.getList("vestiti"), object.getList("tipo"));
    com.clothapp.ImageFragment.lista.add(toAdd);
    mPagerAdapter.notifyDataSetChanged();
}