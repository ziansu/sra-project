@java.lang.Override
public void run() {
    if ((Img_url != null) && (Img_url != "")) {
        com.squareup.picasso.Picasso.with(thiscontext).load(Img_url).into(current_img);
    }
    CurrentHotel.setText(myhotel);
    pager = pagecontainer.getViewPager();
    pageAdapter = new com.vinmein.dvadivel.foodie.fragment.homeFragment.MyPagerAdapter(getActivity().getApplicationContext(), mData);
    pager.setAdapter(pageAdapter);
    pager.setClipChildren(false);
    pager.setOffscreenPageLimit(15);
}