@java.lang.Override
public void run() {
    if (threadInitial) {
        main.frame.setVisible(false);
        main.musicPlayer = new tk.atherismotorsports.music.NewMusicPlayer(main);
        main.musicPlayer.frame.setVisible(false);
        main.map = new tk.atherismotorsports.Map(main);
        main.map.mapFrame.setVisible(false);
        java.lang.System.out.println("Done loading all preliminary things");
    }
    threadInitial = false;
}