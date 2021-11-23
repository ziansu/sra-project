@java.lang.Override
public void onClick(android.view.View v) {
    FilmGenre.mViewPager.setVisibility(View.INVISIBLE);
    ((com.example.disney.videoApp.FilmGenre) (context)).findViewById(R.id.fab).setVisibility(View.INVISIBLE);
    fm.beginTransaction().replace(R.id.main_fragment_container, new com.example.fragments.DetailsFragment(videos.get(position)), FilmGenre.DETAILS_FRAGMENT).addToBackStack(FilmGenre.DETAILS_FRAGMENT).commit();
}