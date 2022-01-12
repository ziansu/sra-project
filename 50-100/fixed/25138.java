private void goToNextStory(int index) {
    if (index == 5) {
        nowPlaying.stop();
        startActivity(new android.content.Intent(this, com.quadcoder.coinpet.page.signup.SignupActivity.class));
        finish();
    }else {
        imgvStory.setImageResource(imgStory[index]);
        tvStory.setText(textStory[index]);
        nowPlaying.stop();
        nowPlaying = new com.quadcoder.coinpet.audio.AudioEffect(audioStory[index]);
        nowPlaying.play();
    }
}