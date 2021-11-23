public void goToGameOver() {
    getFragmentManager().beginTransaction().add(R.id.fragmentContainer, new com.example.jonas.galgelegaflevering.GameOverFragment()).commit();
}