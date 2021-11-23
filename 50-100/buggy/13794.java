public static void dfs2(int u) {
    TWO_SAT.vis[u] = true;
    TWO_SAT.id[u] = ++(TWO_SAT.cnt);
    for (int v : TWO_SAT.rev[u])
        if (!(TWO_SAT.vis[v]))
            TWO_SAT.dfs2(v);
        
    
}