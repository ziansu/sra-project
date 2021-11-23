@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 1) {
        if (data == null) {
            java.lang.System.out.println("null");
        }else {
            java.lang.System.out.println("not null");
        }
        com.example.viral.vetogame.Game game = ((com.example.viral.vetogame.Game) (data.getSerializableExtra("gameInfo")));
        adapter.addGame(game);
    }
    super.onActivityResult(requestCode, resultCode, data);
}