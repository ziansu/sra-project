void showResult(java.lang.String result) {
    if (withResult) {
        resultFragment = ((com.example.uvdoha.translate.ResultFragment) (getSupportFragmentManager().findFragmentById(R.id.outputFrame)));
        if ((resultFragment) == null) {
            resultFragment = new com.example.uvdoha.translate.ResultFragment();
        }
        resultFragment.setResult(result);
        getSupportFragmentManager().beginTransaction().replace(R.id.outputFrame, resultFragment).commit();
    }else {
        startActivity(new android.content.Intent(this, com.example.uvdoha.translate.ResultActivity.class).putExtra("result", result));
    }
}