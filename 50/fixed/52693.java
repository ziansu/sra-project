private static void set(int keycode, byte value) {
    for (byte i = 0; i < (net.suizinshu.external.Manager_Keyboard.NUM_KEYS); i++)
        if ((net.suizinshu.external.Manager_Keyboard.keycodes[i]) == keycode)
            net.suizinshu.external.Manager_Keyboard.states[i] = value;
        
    
}