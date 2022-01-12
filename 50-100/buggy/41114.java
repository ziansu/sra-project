@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    this.url = getArguments().getString(com.example.mikehhsu.personalnewsfeed.fragment.NewsDetailFragment.TEXT_URL);
    new com.example.mikehhsu.personalnewsfeed.network.ArticleDetailFetchCommand(((android.widget.RelativeLayout) (getView().findViewById(R.id.f_news_detail_rl_text)))).execute(this.url, "1234");
}