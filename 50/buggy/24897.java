@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (newUser) {
        io.github.vkb24312.GameoStuff.StartUp.signup(json);
        frame.dispose();
    }else {
        io.github.vkb24312.GameoStuff.Main.login(json, json.get("userJSON"));
    }
}