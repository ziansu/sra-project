@java.lang.Override
public void run() {
    for (int a = 0; a < 10; a++)
        if ((frequency) == (sandbox.utils.Variables.DECIMAL_FREQUENCIES[a]))
            audioContext.out.addInput(decimalWavePlayers[a]);
        
    
    if ((frequency) == (sandbox.utils.Variables.PAUSE_FREQUENCY))
        audioContext.out.addInput(pauseWavePlayer);
    
    if ((frequency) == (sandbox.utils.Variables.START_END_FREQUENCY))
        audioContext.out.addInput(start_endWavePlayer);
    
    audioContext.start();
}