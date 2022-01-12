public static void main(java.lang.String[] args) {
    try {
        startClient("com.icloud.itfukui0922.player.AITWolfPlayer", "AITWolf", "kachako.org", 10000, 1);
    } catch (java.lang.ClassNotFoundException e) {
        java.lang.System.err.println("指定したクラスが見つかりません");
        e.printStackTrace();
    } catch (java.lang.InstantiationException e) {
        java.lang.System.err.println("インスタンス生成に失敗しました．Playerインターフェースを実装しているか確認してください");
        e.printStackTrace();
    } catch (java.lang.IllegalAccessException e) {
        java.lang.System.err.println("予想しないクラス定義があります．パッケージの動的変更やクラスがprivateになっていないか確認してください");
        e.printStackTrace();
    }
}