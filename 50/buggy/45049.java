@java.lang.Override
public void run() {
    com.example.simon.battleships.GameManager.playSound("boom");
    {
        handler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                com.example.simon.battleships.GameManager.playSound("splash");
            }
        }, 3000);
    }
}