@java.lang.Override
public void onBindViewHolder(com.example.sergio.spotify_angular.adapters.CategoriesAdapter.CategoriesViewHolder holder, int position) {
    kaaes.spotify.webapi.android.models.Category category = data.get(position);
    com.example.sergio.spotify_angular.adapters.CategoriesAdapter.CategoriesViewHolder categoryViewHolder = ((com.example.sergio.spotify_angular.adapters.CategoriesAdapter.CategoriesViewHolder) (holder));
    categoryViewHolder.setName(category.name);
    bindToListener(categoryViewHolder);
    com.squareup.picasso.Picasso.with(context).load(category.icons.get(0).url).placeholder(R.drawable.ic_categories).into(categoryViewHolder.getImage());
}