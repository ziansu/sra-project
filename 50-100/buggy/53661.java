@java.lang.Override
public void onResponse(retrofit2.Call<java.lang.Void> call, retrofit2.Response<java.lang.Void> response) {
    if ((response.code()) == 200) {
        android.util.Log.e("log", "post movie score ==== success");
        android.widget.Toast.makeText(mContext, "점수가 입력되었습니다.", Toast.LENGTH_SHORT).show();
        mRandomMovies.get(position).setScore(score);
        notifyItemChanged(position);
    }
}