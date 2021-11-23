public static void addPythonEngine(com.suyong.kakaobot.script.PythonScriptEngine engine) throws java.lang.Exception {
    engine.execute();
    com.suyong.kakaobot.KakaoTalkListener.pythonEngines.add(engine);
}