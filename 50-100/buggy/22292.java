public static void doToolEvent(android.content.Context context, int index, java.lang.Object data) {
    switch (index) {
        case com.leon.assistivetouch.main.bean.KeyItemInfo.TOOL_SCREENSHOT :
            {
                com.leon.assistivetouch.main.util.ToolAction.doScreenShot();
                break;
            }
        case com.leon.assistivetouch.main.bean.KeyItemInfo.TOOL_KILL_PROCESS :
            com.leon.assistivetouch.main.util.ToolAction.doKillProcess(context);
            break;
        default :
            break;
    }
}